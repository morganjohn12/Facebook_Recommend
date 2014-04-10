$(document).ready(function() {
    var first = true;
    var content_displayed = false;
	var alert_one_shown = false;
	var alert_two_shown = false;

	
	
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	///////////////////  Show Music //////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	$('#showMusic').click(function() {
		var $alert_one = $('.alert1'); 
		var $alert_two = $('.alert2');
		var $alert_three = $('.alert3');
		
       if (content_displayed == true) {
       // On click hide the content that is currently displayed
                
		/////////////////////////////////////////////////////////
		///////////////////  CASE ONE  //////////////////////////
		/////////////////////////////////////////////////////////
		if (alert_one_shown == true) {
				$alert_one.animate( {
			       right: -($alert_one.outerWidth() + 50)
			    },
			    function() {
				$alert_one.hide();
				$('#showMusic').css('color', '#555555').css('background-color', '#f2f2f2');
				
				content_displayed = true;
				alert_one_shown = true;
				content_displayed = false;
				alert_one_shown = false;
			});
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE TWO  //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_two_shown == true) {
			$alert_two.animate( {
			right: -($alert_two.outerWidth() + 1000)
                    },
                    function() {
                        $alert_two.hide();
						$('#showMovies').css('color', '#555555').css('background-color', '#f2f2f2');			
			content_displayed = false;
			alert_two_shown = false;
			
			$alert_one.show()
						.css("right", -($alert_one.outerWidth() + 50)).animate({right: 0});
						$('.alert1').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						content_displayed = true;
						alert_one_shown = true;
		    });
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE THREE //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_three_shown == true) {
				$alert_three.animate( {
			       right: -($alert_three.outerWidth() + 50)
			    },
			    function() {
				$alert_three.hide();
				$('#showTV').css('color', '#555555').css('background-color', '#f2f2f2');
				content_displayed = false;
				alert_three_shown = false;
				
					$alert_one.show()
						.css("right", -($alert_one.outerWidth() + 50)).animate({right: 0});
						$('.alert1').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						
						content_displayed = true;
						alert_one_shown = true;
			});
		}
		
            }
            else {
                // Slide in the content
                $alert_one.show()
			.css("right", -($alert_one.outerWidth() + 50)).animate({right: 0});
			$('.alert1').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
			$('#showMusic').css('color', '#FFFFFF').css('background-color', '#3b5999');
			content_displayed = true;
			alert_one_shown = true;
			
            }
        });
	
	
	
	
	
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	///////////////////  Show Movies //////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	$('#showMovies').click(function() {
		var $alert_one = $('.alert1'); 
		var $alert_two = $('.alert2');
		var $alert_three = $('.alert3');
		
            if (content_displayed == true) {
                // On click hide the content that is currently displayed
                
		/////////////////////////////////////////////////////////
		///////////////////  CASE ONE  //////////////////////////
		/////////////////////////////////////////////////////////
		if (alert_one_shown == true) {
				$alert_one.animate( {
			       right: -($alert_one.outerWidth() + 1000)
			    },
			    function() {
				$alert_one.hide();
				$('#showMusic').css('color', '#555555').css('background-color', '#f2f2f2');
				content_displayed = false;
				alert_one_shown = false;
				
				$alert_two.show()
						.css("right", -($alert_two.outerWidth() + 1000)).animate({right: 0});
						$('.alert2').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						$('#showMovies').css('color', '#FFFFFF').css('background-color', '#3b5999');
						
						content_displayed = true;
						alert_two_shown = true;
			});
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE TWO  //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_two_shown == true) {
			$alert_two.animate( {
			right: -($alert_two.outerWidth() + 1000)
                    },
                    function() {
                        $alert_two.hide();
                        $('#showMovies').css('color', '#555555').css('background-color', '#f2f2f2');
			
			content_displayed = false;
			alert_two_shown = false;
		    });
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE THREE //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_three_shown == true) {
				$alert_three.animate( {
			       right: -($alert_three.outerWidth() + 1000)
			    },
			    function() {
				$alert_three.hide();
				$('#showTV').css('color', '#555555').css('background-color', '#f2f2f2');
				content_displayed = false;
				alert_three_shown = false;
				
					$alert_two.show()
						.css("right", -($alert_two.outerWidth() + 1000)).animate({right: 0});
						$('.alert2').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						$('#showMovies').css('color', '#FFFFFF').css('background-color', '#3b5999');
						content_displayed = true;
						alert_two_shown = true;
			});
		}
		
            }
            else {
                // Slide in the content
                $alert_two.show()
			.css("right", -($alert_two.outerWidth() + 1000)).animate({right: 0});
			$('.alert2').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
			$('#showMovies').css('color', '#FFFFFF').css('background-color', '#3b5999');
			content_displayed = true;
			alert_two_shown = true;
			
            }
        });
	

	
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	///////////////////  TV Shows  //////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	$('#showTV').click(function() {
		var $alert_one = $('.alert1'); 
		var $alert_two = $('.alert2');
		var $alert_three = $('.alert3');
		
            if (content_displayed == true) {
                // On click hide the content that is currently displayed
                
		/////////////////////////////////////////////////////////
		///////////////////  CASE ONE  //////////////////////////
		/////////////////////////////////////////////////////////
		if (alert_one_shown == true) {
				$alert_one.animate( {
			       right: -($alert_one.outerWidth() + 1000)
			    },
			    function() {
				$alert_one.hide();
				$('#showMusic').css('color', '#555555').css('background-color', '#f2f2f2');
				
				content_displayed = false;
				alert_one_shown = false;
				$alert_three.show()
						.css("right", -($alert_three.outerWidth() + 1000)).animate({right: 0});
						$('.alert3').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						$('#showTV').css('color', '#FFFFFF').css('background-color', '#3b5999');
						content_displayed = true;
						alert_three_shown = true;
			});
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE TWO  //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_two_shown == true) {
			$alert_two.animate( {
			right: -($alert_two.outerWidth() + 1000)
                    },
                    function() {
                        $alert_two.hide();
                        $('#showMovies').css('color', '#555555').css('background-color', '#f2f2f2');
			
			content_displayed = false;
			alert_two_shown = false;
			
			$alert_three.show()
						.css("right", -($alert_three.outerWidth() + 1000)).animate({right: 0});
						$('.alert3').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
						$('#showTV').css('color', '#FFFFFF').css('background-color', '#3b5999');
						content_displayed = true;
						alert_three_shown = true;
		    });
		}
		/////////////////////////////////////////////////////////
		///////////////////  CASE THREE //////////////////////////
		/////////////////////////////////////////////////////////
		else if (alert_three_shown == true) {
				$alert_three.animate( {
			       right: -($alert_three.outerWidth() + 1000)
			    },
			    function() {
				$alert_three.hide();
				$('#showTV').css('color', '#555555').css('background-color', '#f2f2f2');
				content_displayed = false;
				alert_three_shown = false;
			});
		}
		
            }
            else {
                // Slide in the content
            $alert_three.show()
			.css("right", -($alert_three.outerWidth() + 1000)).animate({right: 0});
			$('.alert3').css('margin-top', -67).css('margin-left',300).css('color', '#555555')
									.css('background-color', '#f2f2f2');
			$('#showTV').css('color', '#FFFFFF').css('background-color', '#3b5999');
			content_displayed = true;
			alert_three_shown = true;
			
            }
        });
    });