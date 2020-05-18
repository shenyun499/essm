$(function() {
	/*弹出登陆框*/
	//delegate 可以动态的补抓用js生成的标签
	$('body').delegate('#btn', 'click', function() {
		left = '51.3%';
		top = '13.5%';
		$('#dialog').css('left', left);
		$('#dialog').css('top', top);
		$('#screen').show();
		$('#dialog').show();
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
	
	/* 注册实现 */
	$('body').delegate('#reg', 'click', function() {
		left = '51.3%';
		top = '13.5%';
		$('#dialog_re').css('left', left);
		$('#dialog_re').css('top', top);
		$('#dialog').hide();
		$('#dialog_re').show();
	});
	$('body').delegate('#login', 'click', function() {
		$('#dialog_re').hide();
		$('#dialog').show();
	});
	$('body').delegate('#close_reg', 'click', function() {
		$('#screen').hide();
		$('#dialog_re').hide();
	});
	/* 数据校验 */
	$('body').delegate('#r_username', 'blur', function() {
		checkRDataU();
	});
	$('body').delegate('#r_password', 'blur', function() {
		checkRDataP();
	});
	$('body').delegate('#email', 'blur', function() {
		checkRDataE();
	});
	$('body').delegate('#checknum', 'blur', function() {
		checkRDataY();
	});
	$('body').delegate('#rform', 'submit', function() {
		var c1 = checkRDataU();
		if (!c1) {
			alert("用户名不能为空！");
			return false;
		}
		var c2 = checkRDataP();
		if (!c2) {
			alert("密码不能为空！");
			return false;
		}
		var c3 = checkRDataE();
		if (!c3) {
			alert("邮箱不能为空！");
			return false;
		}
		var c4 = checkRDataY();
		if (!c4) {
			alert("验证码不能为空！");
			return false;
		}
		return true;
	});
	//禁止选中对话框内容
	if (document.attachEvent) { //ie的事件监听，拖拽div时禁止选中内容，firefox与chrome已在css中设置过-moz-user-select: none; -webkit-user-select: none;
		g('dialog_re').attachEvent('onselectstart', function() {
			return false;
		});
	}
	/*鼠标按下*/
	$('body').delegate('#h_reg', 'mousedown', function(event) {
		x = event.pageX - parseInt($('#dialog_re').css('left'));
		y = event.pageY - parseInt($('#dialog_re').css('top'));
		isCanMove = true;
	});
	/*鼠标放开*/
	$('body').delegate('#h_reg', 'mouseup', function(event) {
		isCanMove = false;
	});
	
	/*鼠标移动*/
	$('body').delegate(document, 'mousemove', function(event) {
		if (isCanMove) {
			left = event.pageX - x;
			top = event.pageY - y;
			$('#dialog_re').css('left', left);
			$('#dialog_re').css('top', top);
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
	
	function checkRDataU() {
		if ($('#r_username').val() == "") {
			console.log('');
			$('#t_reg').text("请输入用户名");
			$('#t_reg').css('color', 'red');
			return false;
		} else {
			$('#t_reg').text("");
			return true;
		}
	};
	
	function checkRDataP() {
		if ($('#r_password').val() == "") {
			console.log('');
			$('#t_reg').text("请输入密码");
			$('#t_reg').css('color', 'red');
			return false;
		} else {
			$('#t_reg').text("");
			return true;
		}
	};
	
	function checkRDataE() {
		if ($('#email').val() == "") {
			console.log('');
			$('#t_reg').text("请输入邮箱");
			$('#t_reg').css('color', 'red');
			return false;
		} else {
			$('#t_reg').text("");
			return true;
		}
	};
	
	function checkRDataY() {
		if ($('#checknum').val() == "") {
			console.log('');
			$('#t_reg').text("请输入验证码");
			$('#t_reg').css('color', 'red');
			return false;
		} else {
			$('#t_reg').text("");
			return true;
		}
	};
})
