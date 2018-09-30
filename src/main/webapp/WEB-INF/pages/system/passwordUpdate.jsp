<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html>
	<head>
		<%@ include file="/WEB-INF/pages/include/head.jsp"%>
	</head>

	<body>
		<form id="submitForm" action="${BASE_PATH}/system/user/passwordUpdate" class="eossForm" method="post">
			<input type="hidden" name="id" value="${user.id}"/>
			<table class="eossFromTable">
				<tr class="panel-header">
					<td colspan="99">密码更新</td>
				</tr>
				<tr>
					<td align="right" width="100">用户名称：</td>
					<td>
						<input type="text" id="userName" name="username" value="${user.username}" disabled/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">用户密码：</td>
					<td>
						<input type="text" id="userPwd" name="password"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<a id="submitBtn" href="###" class="easyui-linkbutton">提交</a>
					</td>
				</tr>
			</table>
		</form>
    <script type="text/javascript">
        $(function () {
            $('#submitBtn').click(function () {
                if($('#userPwd').val().trim() == ''){
                    $('#userPwd').val('');
                    top.$.messager.alert('提示','密码不能为空');
                    return;
                }
                if($('#userPwd').val().length < 6){
                    $('#userPwd').val('');
                    top.$.messager.alert('提示','至少6位密码');
                    return;
                }
                $('#submitForm').submit();
            })
        })
    </script>
	</body>
</html>
