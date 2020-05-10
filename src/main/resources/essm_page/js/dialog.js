$(function() {
	/*弹出登陆框*/
	//delegate 可以动态的补抓用js生成的标签
	$('body').delegate('#btn', 'click', function() {
		$('#screen').show();
		$('#dialog').show();
		//		var sH=$(window).scrollTop();
		//		console.log(sH);
		//		$('#screen').css('height',sH);
	});
	/*关闭登陆框*/
	$('body').delegate('#d_close', 'click', function() {
		$('#screen').hide();
		$('#dialog').hide();
	});
	$('body').delegate('#username', 'blur', function() {
		checkDataU();
	});
	$('body').delegate('#password', 'blur', function() {
		checkDataP();
	});
	$('body').delegate('#lform', 'submit', function() {
		var c1 = checkDataU();
		if (!c1) {
			alert("用户名不能为空！");
			return false;
		}
		var c2 = checkDataP();
		if (!c2) {
			alert("密码不能为空！");
			return false;
		}
		return true;
	});
	//禁止选中对话框内容
	if (document.attachEvent) { //ie的事件监听，拖拽div时禁止选中内容，firefox与chrome已在css中设置过-moz-user-select: none; -webkit-user-select: none;
		g('dialog').attachEvent('onselectstart', function() {
			return false;
		});
	}
	var x, y; //鼠标到对话框的x,y
	var left, top; //真实的left top
	var isCanMove = false; //设置为不可拖动
	/*鼠标按下*/
	$('body').delegate('#d_header', 'mousedown', function(event) {
		x = event.pageX - parseInt($('#dialog').css('left'));
		y = event.pageY - parseInt($('#dialog').css('top'));
		isCanMove = true;
	});
	/*鼠标放开*/
	$('body').delegate('#d_header', 'mouseup', function(event) {
		isCanMove = false;
	});

	/*鼠标移动*/
	$('body').delegate(document, 'mousemove', function(event) {
		if (isCanMove) {
			left = event.pageX - x;
			top = event.pageY - y;
			$('#dialog').css('left', left);
			$('#dialog').css('top', top);
		}
	});

	/*计划状态*/
	$('body').delegate('#schedule', 'click', function() {
		if ($('#screen').css('display') == 'none') {
			$('#screen').show();
			$('#dialog2').show();
		}
	});
	$('body').click(function(event) {
		var evt = event.srcElement ? event.srcElement : event.target;
		if ($('#dialog2').css('display') != 'none' && evt.id == 'screen') {
			$('#screen').hide();
			$('#dialog2').hide();
		}
	});

	function checkDataU() {
		if ($('#username').val() == "") {
			console.log('');
			$('#d_tip').text("请输入用户名");
			$('#d_tip').css('color', 'red');
			return false;
		} else {
			$('#d_tip').text("");
			return true;
		}
	};

	function checkDataP() {
		if ($('#password').val() == "") {
			console.log('');
			$('#d_tip').text("请输入密码");
			$('#d_tip').css('color', 'red');
			return false;
		} else {
			$('#d_tip').text("");
			return true;
		}
	};
})
