$(function() {
	/*添加单词*/
	$('body').delegate('#aform', 'submit', function() {
		if ($('#english').val() == "") {
			alert('单词英文输入不能为空！');
			return false;
		}
		if ($('#chinese').val() == "") {
			alert('单词中文输入不能为空！');
			return false;
		}
		alert('添加成功！');
		return true;
	});
	
	/*格式化个人库*/
	$('body').delegate('#clearall', 'click', function() {
		alert("这是格式化个人库操作！！！");
		$('#screen').show();
		$('#dialog3').show();
	});

	$('body').delegate('#password2', 'blur', function() {
		if($('#password2').val() == "") {
			$('#d_tip2').text("请输入密码");
			$('#d_tip2').css('color', 'red');
		} else {
			$('#d_tip2').text("");
		}
	});
	
	$('body').delegate('#pform', 'submit', function() {
		if($('#password2').val() == "") {
			$('#d_tip2').text("请输入密码");
			$('#d_tip2').css('color', 'red');
			alert('密码不能为空！');
			return false;
		} else {
			/*ajax查询密码，正确则格式化成功*/
			alert('格式化成功！');
			return true;
		}
	});

	$('body').delegate('#d_close2', 'click', function() {
		$('#screen').hide();
		$('#dialog3').hide();
	});
	
	/* 今日计划制定 */
	$('body').delegate('#pto', 'click', function() {
		$('#screen').show();
		$('#dialog4').show();
	});
	
	$('body').delegate('#d_close3', 'click', function() {
		$('#screen').hide();
		$('#dialog4').hide();
	});
	
	/* 明日计划制定 */
	$('body').delegate('#pmo', 'click', function() {
		$('#screen').show();
		$('#dialog5').show();
	});
	
	$('body').delegate('#d_close4', 'click', function() {
		$('#screen').hide();
		$('#dialog5').hide();
	});

})