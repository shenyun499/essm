$(function() {
	//使用jQuery的load方法，将页面加载进来
	$(".include").each(function() {
		if(!!$(this).attr("file")) {
			var $includeObj = $(this);
			$(this).load($(this).attr("file"), function(html) {
				$includeObj.after(html).remove(); //加载的文件内容写入到当前标签后面并移除当前标签
			})
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
})