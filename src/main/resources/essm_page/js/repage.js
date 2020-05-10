$(function() {
	//使用jQuery的load方法
	$(".include").each(function() {
		if(!!$(this).attr("file")) {
			var $includeObj = $(this);
			$(this).load($(this).attr("file"), function(html) {
				$includeObj.after(html).remove(); //加载的文件内容写入到当前标签后面并移除当前标签
			})
		}
	});
})