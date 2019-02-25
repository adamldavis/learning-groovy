/*! parts taken from tumblr | MIT License */
/* Converted to groocss by Adam L. Davis */
/********************
 GENERAL
 ********************/

sg '::-moz-selection', {
	background '#8fc045' color '#ffffff'
}

sg '::selection', {
	background '#8fc045' color '#ffffff'
}

sg '#links,#search,#posts,#disqus,#notes,#posts footer', {
	width '100%'
	maxWidth '700px'
	margin '0 auto'
	position 'relative'
}

_.menu _.wrapper | _.title | _.post | _.post ^ h3 | (_.post ^ p) | (_.post ^ ul) |
		_.post ^ ol | _.post ^ _.caption | _.post ^ _.description | _.response {
	extend '#links,#search,#posts,#disqus,#notes,#posts footer'
}

div.page_title {
	extend '#links,#search,#posts,#disqus,#notes,#posts footer'
	maxWidth '650px'
}

sg '#disqus,#notes,#posts footer', {
	maxWidth '650px'
}

_.post ^ h3 | _.post ^ p | _.post ^ _.caption | _.post ^ _.description | _.
		post ^ blockquote | _.post ^ ul | _.post ^ ol | _.chat ^ ul | _.response {
	extend '#disqus,#notes,#posts footer'
}

/********************
 TYPOGRAPHY
 ********************/

sg 'body, .quote h3:before', {
	fontFamily "'lora', georgia, 'times new roman', times, serif" fontSize 18. px;	/* 18px */
	lineHeight 1.66666667.em	/* 30px */
	fontWeight 400 add style('text-rendering', 'optimizelegibility')
	add style('font-feature-settings', '"kern" 1, "liga" 1')
}

sg '.navigation a, #posts footer, #links li a, .post-date a, #notes .notes li, .copyright, .copyright a', {
	fontFamily "'montserrat', arial, helvetica, sans-serif"
}

sg '.menu .nav-button .close', {
	fontFamily "'jura', 'montserrat', arial, helvetica, sans-serif"
}

h1 | h2 | h3 | h4 | h5 | h6 | blockquote {
	fontFamily "'roboto slab', georgia, 'times new roman', times, serif"
	add style('font-feature-settings', '"onum" 1')
}

h1 {
	fontSize 3.333333.em	/* 60px */
	lineHeight 1.1333333.em	/* 68px */
	fontWeight 300}

h2 {
	fontSize 2.6666667.em	/* 48px */
	lineHeight 1.1666667.em	/* 56px */
	fontWeight 300
	marginBottom '30px !important'
}

h3 {
	fontSize 2.em		/* 36px */
	lineHeight 1.2222222.em	/* 44px */
	fontWeight 400
	marginBottom '30px !important'
}

h4 {
	fontSize 1.6666667.em	/* 30px */
	lineHeight 1.2666667.em	/* 38px */
	fontWeight 400
	marginBottom '20px !important'
}

h5 {
	fontSize 1.3333333.em	/* 24px */
	lineHeight 1.3333333.em	/* 32px */
	fontWeight 700
	marginBottom '20px !important'
}

h6 {
	fontSize 1.em		/* 18px */
	lineHeight 1.4444444.em	/* 26px */
	fontWeight 700
}

a {
	textDecoration 'underline'}

p {
	marginBottom '30px !important'
	letterSpacing '0.001em'
	add style('font-feature-settings', '"onum" 1')
}

p % lastChild {
	marginBottom 0
}

blockquote {
	margin '5px 0 15px 60px'
	fontSize 1.1.em	/* 24px */
	lineHeight 1.3.em	/* 32px */
	add style('font-feature-settings', '"onum" 1')}

_.post ^ ul | _.post ^ ol {
	padding 0 margin '5px 0 15px 60px'
}

_.post ^ ul ^ li | _.post ^ ol ^ li {
	margin '5px 0'}

strong {
	fontWeight 700}

em {
	fontStyle 'italic'}

sg '.page-title', {
	textAlign 'left'
	marginBottom '40px !important'}

/********************
 HEADER
 ********************/

header {
	position 'relative'
	marginTop '125px'}

_.portrait {
	width '128px'
	height '128px'
	display 'block'
	position 'relative'
	margin '0 auto'
	border '5px solid #fff'
	borderRadius '50%'
}

_.portrait ^ img {
	borderRadius '50%'}

_.title {
	textAlign 'center' margin '30px auto 90px auto !important'}

_.title ^ a {
	textDecoration 'none'}

/********************
 NAVIGATION
 ********************/

_.navigation {
	width '100%'
	display 'block' position 'relative' top '30px' overflow 'hidden'}

_.navigation ^ a {
	fontWeight 700 fontSize 2.em	/* 36px */
	lineHeight 1.em	/* 36px */
	textTransform 'uppercase'
	letterSpacing '0.025em'
	textAlign 'center'
	width '50%'
	display 'inline-block' margin 0 padding '50px 0'
	textDecoration 'none'}

sg '.navigation .nav-next', {
	cssFloat 'right'}

sg '.navigation .permalink-nav-previous', {
	cssFloat 'right'}

/********************
 POSTS
 ********************/

_.text ^ h3 ^ a | _.chat ^ h3 ^ a | _.answer ^ h3 ^ a {
	textDecoration 'none'}

_.text ^ img | _.photo ^ img | _.link ^ img | _.quote ^ img | _.chat ^ img {
	maxWidth '100%'
	position 'relative' margin '0 auto 30px auto' display 'block'}

sg '.video-wrap,#player,.video-wrapper,.photo-slideshow .pxu-photo', {

}

_.text ^ img | _.photo ^ img | _.photoset ^ img | embed |
		iframe | object | figure | video {
	borderRadius '4px !important'}

_.post ^ _.caption | _.post ^ _.description {
	marginTop '30px'}

_.post ^ _.source {
	margin '30px 0 0 60px'}

_.quote ^ h3 {
	position 'relative' zIndex 10}

sg '.quote h3:before', {
	content '“' fontSize 6.em	/* 60px */
	lineHeight 1.em	/* 68px */
	fontWeight 700
	display 'block'
	position 'absolute'
	top '-40px'
	left '-40px' zIndex '-1' opacity 0.25 filter 'alpha(opacity=25)'}

_.chat ^ ul {
	margin '0 auto' padding 0 listStyle 'none'}

_.chat ^ ul ^ li {
	margin 0 padding '11px 0 11px 0'}

_.chat ^ ul ^ li % firstChild {
	paddingTop 0}

_.chat ^ ul ^ li ^ _.label {
	fontWeight 700 marginRight '3px'}

_.audio ^ iframe | _.audio ^ object | _.audio ^ embed {
	width '100% !important'
	height 'inherit !important'}

_.answer ^ _.response ^ strong {
	display 'inline' cssFloat 'left' marginRight '8px'}

sg '.post-date', {
	position 'absolute' top 0 left '-115px'}

sg '.post-date a', {
	display 'block' textAlign 'left' fontSize 1.em	/* 18px */
	lineHeight 1.4444444.em	/* 26px */
	fontWeight 400 textDecoration 'none'}

_.link {
	textDecoration 'none'}

sg '.permalink-page', {
	marginTop '140px !important'}

_.soundcloud_audio_player {
	width '100%'
}

/********************
 FOOTER
 ********************/

sg '#posts footer', {
	paddingBottom '80px'
	margin '30px auto 80px auto'
	display 'block'
	fontWeight 400
	textTransform 'uppercase' letterSpacing '0.005em' textAlign 'left'}

sg '#posts footer .info', {
	listStyle 'none' margin 0 padding 0}

sg '#posts footer .info li', {
	margin '0 15px 0 0' padding 0 display 'inline'}

sg '#posts footer .info .date', {
	display 'none'}

sg '#posts footer .info a', {
	fontSize 0.7222222.em	/* 13px */
	lineHeight 1.461538.em	/* 19px */
	textDecoration 'none'}

sg '#posts footer .tags', {
	listStyle 'none'
	margin '0 0 10px -5px' padding 0 maxWidth '650px' display 'block'}

sg '#posts footer .tags .tag', {
	margin '0 10px 0 0' padding 0 display 'inline-block' whiteSpace 'nowrap'}

sg '#posts footer .tags .tag a', {
	padding '5px' fontSize 0.6111111.em	/* 11px */
	lineHeight 1.54545454.em	/* 17px */
	textDecoration 'none'}

/********************
 MENU
 ********************/

_.menu {
	zIndex 20000
	position 'fixed'
	top 0
	padding '10px 0'
	margin 0
	width'100%'
}

sg '.menu .menu-title', {
	margin 0
	padding 0
	position 'relative'
	display 'block'
	maxWidth '90%'
	zIndex 21000
	visibility 'hidden'
	opacity 0
	filter 'alpha(opacity=0)'
}

sg '.menu .menu-title a', {
	textDecoration 'none'
	margin 0
	padding '15px'
	display 'block'
	marginLeft '-15px'}

sg '.menu .menu-title a img', {
	maxWidth '32px'
	maxHeight '32px'
	marginRight '15px'
	marginTop '-3px'
	position 'relative'
	borderRadius '50%'
	display 'inline'
	cssFloat 'left'}

sg '.menu .nav-button', {
	display 'block'
	margin 0
	padding '15px'
	zIndex 21000
	cursor 'pointer'
	width '25px'
	height '25px'
	position 'absolute'
	right '-15px'
	top 0}

sg '.menu .nav-button hr', {
	margin '4px 0'
	padding 0
	outline 'none'
	border 'none'
	height '3px'
	borderRadius '2px'
	width '100%'
	display 'block'}

sg '.menu .nav-button .close', {
	position 'absolute'
	top '12px'
	left '14px'
	display 'block'
	width '25px'
	height '25px'
	fontSize '40px'
	fontWeight 600
	lineHeight 'none'
	opacity 0
	filter 'alpha(opacity=0)'
	visibility 'hidden'}

sg '#menu', {
	position 'fixed'
	opacity 0
	filter 'alpha(opacity=0)'
	visibility 'hidden'
	overflowY 'scroll'
	top 0; bottom 0; right 0; left 0; height '100%'; width '100%'}

sg '#search', {
	display 'block' margin '100px auto 10px auto'}

sg '#search input', {
	fontSize 3.333333.em	/* 60px */
	lineHeight 1.1333333.em	/* 68px */
	fontWeight 700
	textAlign 'center'
	display 'block'
	width '100%'
	padding '10px 0 25px 0'
	margin 0; border 'none'; outline 'none'; background 'transparent'}


_.fullscreen {
	zIndex '15000 !important'
	opacity '1 !important'
	filter 'alpha(opacity=100) !important'
	visibility 'visible !important'
	add style('zoom', '1 !important')}

_.copyright {
	opacity 0.5 filter 'alpha(opacity=50)'}

_.copyright | _.copyright ^ a {
	fontSize '12px !important'
	lineHeight '18px !important'
	fontWeight '400 !important'
	textAlign 'center !important'
	padding '0 !important'}

_.copyright ^ a {
	display 'inline !important'}

/********************
 COMMENTS AND NOTES
 ********************/

sg '#disqus,#notes', {
	marginBottom '100px !important'}

sg '#notes .notes', {
	margin 0 padding 0 listStyle 'none'}

sg '#notes .notes li', {
	margin '10px 0' fontSize 0.777777778.em	/* 14px */
	lineHeight 1.428571.em	/* 20px */
	fontWeight 400}

sg '#notes .notes li a', {
	textDecoration 'none'}

sg '#notes .notes li img', {
	borderRadius '50%' marginBottom '-3px' marginRight '8px'}

sg '#notes .notes li blockquote', {
	margin '12px 0 12px 40px' fontSize 1.em	/* 18px */
	lineHeight 1.5555557.em	/* 28px */
}

sg '#notes .notes .more_notes_link_container', {
	marginTop '40px'}

sg '#notes .notes .more_notes_link_container a', {
	fontWeight 700
	textTransform 'uppercase'
	letterSpacing '0.005em'}

/********************
 ANIMATIONS AND TRANSITIONS
 ********************/

sg '.menu .menu-title,#menu,a,.nav-button hr,.nav-button .close', {
	transition 'all 0.15s'}

/********************
 MISC
 ********************/

_.noscroll {
	overflow 'hidden !important'
	overflowY 'hidden !important'
	position 'relative !important'
	add style('zoom', '1 !important')}

_.hide {
	opacity '0 !important'
	filter 'alpha(opacity=0) !important'
	visibility 'hidden !important'
}

_.show {
	opacity '1 !important'
	filter 'alpha(opacity=100) !important'
	visibility 'visible !important'
}

/********************
 PXU Photoset Extended Styles
 ********************/

sg '.clearit:before,.clearit:after', {
	content "" display 'table'}

sg '.clearit:after', {
	clear 'both'}

_.clearit {
	add style('zoom', 1)
}

sg '.photo-slideshow', {
	visibility 'hidden'
}

sg '.photo-slideshow.processed', {
	visibility 'visible'}

sg '.photo-slideshow .row', {
	clear 'both' width '100%'}

sg '.photo-slideshow .pxu-photo', {
	display 'block'
	cssFloat 'left' marginBottom 0 width '100%' overflow 'hidden'}

sg '.photo-slideshow .pxu-photo a', {
	display 'block' position 'relative' zIndex 10000}

sg '.photo-slideshow .pxu-photo img', {
	width '100%' height 'auto'}

sg '.photo-slideshow .pxu-photo:first-child im', {
	marginLeft 0}

sg '.photo-slideshow .count-1', {
	width '100%'}

sg '.photo-slideshow .count-2', {
	width '50%'}

sg '.photo-slideshow .count-3', {
	width '33.3%'}

sg '.photo-slideshow .count-3:first-child', {
	width '33.4%'}

sg '.photo-slideshow .count-4', {
	width '25%'}

sg '.photo-slideshow .count-5', {
	width '20%'}

sg '.photo-data', {
	position 'relative' cssFloat 'left'}

/********************
 MOBILE
 ********************/

media 'only screen and (max-width: 1280px)', {
	sg '#tumblr_controls', {
		display 'none !important'}
}

media 'only screen and (max-width: 960px)', {
	sg '.post-date', {
		display 'none'}

	sg '#posts footer .info .date', {
		display 'inline'}
}

media 'only screen and (max-width: 720px)', {
	body {
		fontSize '16px'}

	sg '#posts,.menu .wrapper,#search input,#disqus,#notes,.page-title,#links', {
		width '90%' margin '0 auto'}
}

media 'only screen and (max-width: 480px)', {
	body {
		fontSize '14px'}

	_.title {
		margin '30px auto 40px auto !important'}

	_.menu {
		padding '5px 0'}

	sg '.menu .menu-title', {
		lineHeight 1.714285.em	/* 24px */
		maxWidth '84%'}

	sg '#search', {
		margin '80px auto 10px auto'}

	sg '#links li', {
		margin '5px auto'}

	sg '#links li a', {
		padding '15px 0'}

	_.navigation {
		top 0}

	_.navigation ^ a {
		padding '20px 0'}

	h2 {
		marginBottom '15px !important'}

	sg 'h2,#links li a,#search input', {
		fontSize 2.em	/* 36px */
		lineHeight 1.2222222.em	/* 44px */
	}

	h3 {
		fontSize 1.6666667.em	/* 30px */
		lineHeight 1.2666667.em	/* 38px */
		marginBottom '15px !important'}

	h4 {
		fontSize 1.3333333.em	/* 24px */
		lineHeight 1.3333333.em	/* 32px */
		marginBottom '10px !important'}

	h5 {
		marginBottom '10px !important'}

	h5 | _.navigation ^ a {
		fontSize 1.em	/* 18px */
		lineHeight 1.4444444.em	/* 26px */
	}

	blockquote {
		margin '2px 0 15px 20px'}

	p {
		marginBottom '17px !important'}

	_.chat ^ ul ^ li {
		margin 0 padding '7px 0 7px 0'}

	sg '.permalink-page', {
		marginTop '90px !important'}

	sg '#posts footer', {
		paddingBottom '30px' margin '20px auto 40px auto'}

	sg '#posts footer .info a', {
		fontSize 0.857142.em	/* 12px */
		lineHeight 1.5.em	/* 18px */
	}

	sg '#posts footer .tags .tag a', {
		fontSize 0.7857142.em	/* 11px */
		lineHeight 1.54545454.em	/* 17px */
	}

	sg '#disqus,#notes', {
		marginBottom '50px !important'}
}

body {
	background '#456' color white}

h1 | h2 | h3 {
	color '#eee'}

a {
	color '#abc'}

sg '.post-date a', {
	color '#abe'}

sg 'p:hover,li:hover', {
	background '#567' boxShadow '0 0 5px rgba(0,0,0,0.5)'}

pre {
	background '#345' padding '1em' boxShadow '5px 5px 5px rgba(0,0,0,0.5)'}

pre % hover {
	background antiqueWhite animation 'phover 1s 1'
}

keyframes 'phover', {
	from {
		background white
	}
	to {
		background antiqueWhite
	}
}

a.github {
	position 'absolute'
	zIndex 99
	top 0
	left 2.em
	textTransform 'uppercase' textDecoration 'none'
	font 'georgia,arial'
}

a.bintray {
	position 'absolute' zIndex 99 marginTop '2em' textTransform 'uppercase'
	textDecoration 'none' font 'georgia,arial'
}

header img % hover {
	rotate(180. deg) animation 'spin180 1s 1'}

header img { borderRadius '50%'}

a % hover {
	translateX(2. px)}

body {
	animation 'colorfade 5s 1'}

/** Padding around stuff */
p | li {
	padding 0.3.em}

/** Animations */
keyframes 'colorfade', {
	from {
		backgroundColor white
	}
	to {
		backgroundColor '#456'
	}
}

p % hover | li % hover {
	animation 'hhover 1s 1'
}

keyframes 'hhover', {
	from { boxShadow '0 0 0'}
	to { boxShadow '0 0 5px rgba(0,0,0,0.5)'}
}

keyframes 'spin180', {
	0 % { rotate(0. deg)}
	33 % { rotate(72. deg)}
	66 % { rotate(144. deg)}
	100 % { rotate(180. deg)}
}
