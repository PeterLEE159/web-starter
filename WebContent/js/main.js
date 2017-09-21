$(function() {
	
	(function() {
		var ipClick = $('#ip-star-click');
		if(ipClick) {
			$('.star-hover').click(function() {
				var value = $(this).attr('value'),
				i = 1, 
				$tags = $('.star-hover'),
				clickFunc = ipClick.val();
				
				var $ipValue = $('#ip-rating-value');
				if($ipValue) $ipValue.val(value);
				
				(window[clickFunc])(value);
				
				for(; i<= 5; i++) {
					if(i <= value) $($tags[5-i]).addClass('filled');
					else $($tags[5-i]).removeClass('filled');
				}
				
			})
		}
		
		var ipHover = $('#ip-star-hover')
		if(ipHover) {
			$('.star-hover').mouseover(function() {
				var value = $(this).attr('value');
				var hoverFunc = ipHover.val();
				(window[hoverFunc])(value);
			})
		}
	})();
	
	
	
	
});