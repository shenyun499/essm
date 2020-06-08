$(function() {
	/*$.ajaxSetup({
		cache: false
	});*/

	//使用jQuery的load方法，将页面加载进来
	$(".include").each(function() {
		if(!!$(this).attr("file")) {
			var $includeObj = $(this);
			$(this).load("/" + $(this).attr("file"), function(html) {
				$includeObj.after(html).remove(); //加载的文件内容写入到当前标签后面并移除当前标签
			})
		}
	});


	//利用load的回调函数实现用户在线监测
	$(".header").load("/header.html", function () {
		if ($.cookie("userid") != null) {
			$('#btn').css("display","none");
			$('#user_btn').text($.cookie("username"));
			$('#user_btn').css("display","inline");
		}
	});


	//登录框操作模块
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
	//登录表单校验
	$('body').delegate('#username', 'blur', function() {
		checkDataU();
	});
	$('body').delegate('#password', 'blur', function() {
		checkDataP();
	});
	//ajax异步登录
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
		$.ajax({
			url: "/login",
			type: "POST",
			data:{
				username: $('#username').val(),
				password: $('#password').val()
			},
			dataType: "json",
			success: function(data, status){
				var result = data["status"]; //数组
				if (result == 1) {
					$('#screen').hide();
					$('#dialog').hide();
					$('#btn').css("display","none");
					$('#user_btn').text($.cookie("username"));
					$('#user_btn').css("display","inline");
					alert("登录成功");
					if (data["sign"] == "1") {
						window.location.href="/admin";
					}
				} else if (result == 2) {
					$('#d_tip').text("用户名或者密码错误!");
					$('#d_tip').css('color', 'red');
				}
			},
			error: function(data, status){
				$('#screen').hide();
				$('#dialog').hide();
				alert("数据错误，多次重试失败后，请联系管理员！");
			}
		});
		return false;
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

	//注册实现
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


	//退出登录
	$('body').delegate('#user_btn', 'click', function() {
		$("#screen").show();
		$("#exit").show();
	});
	$('body').delegate('#close_ex', 'click', function() {
		$("#screen").hide();
		$("#exit").hide();
	});
	$('body').delegate("#exit_form", 'submit', function() {
		$.ajax({
			url: "/exit",
			type: "POST",
			dataType: "text",
			success: function (data, status) {
				alert("退出成功");
				$('#btn').css("display","inline");
				$('#user_btn').css("display","none");
			},
			error: function () {
				alert("退出异常，多次重试失败后，请联系管理员！");
			}
		});
		$("#screen").hide();
		$("#exit").hide();
		return false;
	});


	//计划状态
	$('body').delegate('#schedule', 'click', function() {
		if ($('#screen').css('display') == 'none') {
			$.ajax({
				url: "/plain/status",
				type: "POST",
				dataType: "json",
				data: {
					sign: "1"
				},
				success: function (data) {
					$("#plainst").show();
					var t1 = parseInt(data["addWordNums"]) > parseInt(data["addWordNum"]) ? parseInt(data["addWordNum"]) :parseInt(data["addWordNums"]);
					var t2 = parseInt(data["knowWordNums"]) > parseInt(data["knowWordNum"]) ? parseInt(data["knowWordNum"]) :parseInt(data["knowWordNums"]);
					var t3 = parseInt(data["studyNums"]) > parseInt(data["studyNum"]) ? parseInt(data["studyNum"]) :parseInt(data["studyNums"]);
					var t4 = parseInt(data["gameNums"]) > parseInt(data["gameNum"]) ? parseInt(data["gameNum"]) :parseInt(data["gameNums"]);
					$("#aws").text( t1 + "/" + data["addWordNum"]);
					$("#kws").text(t2 + "/" + data["knowWordNum"]);
					$("#sws").text(t3 + "/" + data["studyNum"]);
					$("#gws").text(t4 + "/" + data["gameNum"]);
				},
				error: function (status) {
					$("#noplain").show();
				}
			});
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

})

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

/*表单校验函数*/
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
