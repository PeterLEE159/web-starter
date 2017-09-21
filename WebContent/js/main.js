$(function() {
	var chkStar = (function() {
		var previous;
		return function(starNum, func, name) {
			var i = 1, tags = $('.star-hover');
			
			if(name) $('#'+name).val(starNum);
			if(func) func(starNum, previous);
			
			for(; i<= 5; i++) {
				if(i <= starNum) $(tags[5-i]).addClass('filled');
				else $(tags[5-i]).removeClass('filled');
			}
			
			previous = starNum;
		};
	})();
});