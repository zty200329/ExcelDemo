<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="pragma" content="no-cache" />
    <base target="_self">
    <title>文件上传</title>
</head>
<body>
<a href="test/download.do?fileName=test.xls">下载Exel模板</a>
<form method="post" action="test/import.do" enctype="multipart/form-data">
    <input type="file" name="files" value="file">
    <input type="submit" value="确定">
</form>
</body>
</html>