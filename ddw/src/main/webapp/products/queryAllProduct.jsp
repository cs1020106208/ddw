<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>

	<%--<!-- 需要引入jquery脚本库以及easyUI脚本库；而且这两个js文件必须有上下顺序 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui-lang-zh_CN1.3.5.js"></script>

	<!-- 还需要引入两个css文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/default/easyui.css">
--%>
	<script type="text/javascript">
        $(function() {
            // 分页查询图书
            $("#prodatagrid").datagrid({

                title: "图书表",
                resizable: true,
                //对话框窗口顶部工具栏
                toolbar: "#myToolbar",
                //展示分页工具栏
                pagination: true,
                //只允许选择一行数据(还可以与复选框搭配使用)
                //singleSelect:true,
                url: "queryAllProduct",
                //通过el表达式中的内置对象param可以在jsp中，
                //获取到请求过来的参数

                columns: [[
                    {checkbox: true, field: "adadadad"},
                    {title: "id", field: "bookId"},
                    {title: "书名", field: "bookName"},
                   // {title: "封面", field: "productImage"},
                    {title: "图书封面", field: "img",width:100,formatter: function(value,row){
                            return "<img src='${pageContext.request.contextPath}/productImages/"+row.productImage+"' width='60' height='45'>"}
                    },

                    {title: "原价", field: "bookPrice"},
                    {title: "原价", field: "dangprice"},
                    {title: "库存", field: "inventory"},
                    {title: "作者", field: "author"},
                    {title: "出版社", field: "press"},
                    {title: "销量", field: "salenum"},
                    {title: "顾客评分", field: "customeScore"},
                    {title: "类别所属", field: "cid"},
                    {title: "简介", field: "messages"},


                ]],
                onDblClickRow:function(rowIndex,rowData){
                    //双击行数据时获取该行的数据并把数据放入修改框中
                    $("#proName").val(rowData.bookName);
                  //  $("#proName").val(rowData.productImage);
                    $("#proPrice").val(rowData.bookPrice);
                    $("#dangPrice").val(rowData.dangprice);
                    $("#inventory").val(rowData.inventory);
                    $("#author").val(rowData.author);
                    $("#press").val(rowData.press);
                    $("#salenum").val(rowData.salenum);
                    $("#custome_core").val(rowData.customeScore);
                    $("#prosele").val(rowData.categoryName);
                    $("#messages").val(rowData.customeScore);
                   // customeScore
                    /* $("#updateUsername").val(rowData.username);
                     $("#updatePassword").val(rowData.password);*/
                     	//获取数据后，自动打开修改框
                    $("#updateProdia").dialog("open");
                },
            });
        });





        //删除数据
        function doDelete(){
            /* 	选中项返回的数组集合，该集合不是id的集合，是object的集合，需要转换 */
            var getSelections=$("#prodatagrid").datagrid("getSelections");
            var ids=new Array(getSelections.length);

            if(getSelections.length==0){
                alert("请勾选要删除的选项");
            }else{
                if(confirm("确认删除所选项吗？")){

                    for(var i=0;i<getSelections.length;i++){
                        ids[i]=getSelections[i].bookId;
                    }

                    $.ajax({
                        url:"deleteMoney.do",
                        data:{"ids":ids},
                        traditional:true,
                        success:function(data){

                            if(data){
                                alert("删除成功");
                                $("#myTable").datagrid("reload");
                            }else{
                                alert("删除失败");
                            }
                        }
                    });
                };
            }
        }



        /*  function doDelete(){
              //获取到所有选中的行：通过datagrid的getSelections方法获取到
              var array=$("#prodatagrid").datagrid("getSelections");
             // alert(array)
              if(array.length==0){
                  $.messager.alert("提示框","请选中要删除的数据","warning");
              }else{
                  $.messager.confirm("确认框","确认真的要删除选中的内容吗？",function(result){
                      if(result){
                          var ids = new Array(array.length);
                                console.log(ids);
                          for(var i=0;i<array.length;i++){
                              ids[i]=array[i].bookId;
                          }
                          //2.发送ajax请求到后台，执行删除操作
                          $.ajax({
                              url:"deleteMoney",
                              //data:"ids="+ids,
                              data:{"ids":ids},//这样写发送到后台的参数名是ids[]
                              //在使用json格式的数据作为参数往后台传递的时候，
                              //数组数据会被jquery做进一步的处理===>key[]作为发送到后台的参数名
                              //jquery的深度序列化
                              //不让jquery做深度序列化
                              traditional:true,

                              success:function(data){
                                  // alert(data+"disange");
                                  if(data){
                                      //alert("删除成功");
                                      $.messager.show({
                                          title:"删除提示",
                                          msg:"删除成功",
                                          showSpeed:2000,
                                          showType:"fade"
                                      });
                                      $("#prodatagrid").datagrid("reload",true);

                                  }else{
                                      alert("删除失败");
                                  }
                              }
                          });
                      }
                  });
              }
          };
  */






        //添加点击事件
        function doInsert(){
            //点击添加按钮，添加窗口打开
            $("#addProdia").dialog("open");
        }
        //提交添加数据
        function addUser(){
            $("#insertForm").form("submit",{
                url:"addUser.do",
                onSubmit: function(){
                    $("#divInsert").dialog("close",true);

                },
                success:function(data){
                    //var result=JSON.parse(data);
                    if(data!=true){
                        alert("添加成功");
                    }else{
                        alert("添加失败");
                    }
                }

            });
        }



        //修改按钮
        $("#updateProdia").linkbutton({
            //显示在按钮文字左侧的图标
            iconCls: 'icon-edit',
        });
        //修改数据
        function updateUser(){
            alert(1);
            $("#updateForm").form("submit",{
                url:"updateUser.do",

                success:function(data){
                    if(data!=true){
                        alert("修改成功");
                        $("#divInsert").dialog("close",true);
                    }else{
                        alert("修改失败");
                    }
                }

            });
        }

	</script>

</head>
<body>

<div id="myToolbar">
	<input id="name" /><input type="button" onclick="searchUsers()" value="搜索"/><br/>
	<a href="javascript:void(0)" id="insert" onclick="doInsert()">添加</a>
	<!--  <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'">0000</a> -->
	<!-- 使用双击选择修改的数据，此标签用不到
     <a href="javascript:void(0)" id="update" onclick="doUpdate()">修改</a>
     -->	  <a href="javascript:void(0)" id="delete" onclick="doDelete()">批量删除</a>
</div>
<table id="prodatagrid"></table>

	<div id="addProdia" class="easyui-dialog" data-options="closed:true">
	<form id="prof1" style="margin:30px" enctype="multipart/form-data" method="post">
	<table>
	<tr><td>
		图书名字：<input class="easyui-validatebox"  name="book_name" data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
		图书封面：<input class="easyui-filebox" name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>
	</td>
	<td>
		图书原价：<input class="easyui-validatebox" name="book_price" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
		当当价格：<input class="easyui-validatebox"  name="Dangprice" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
		</td></tr>
		<tr><td>
		库存：&nbsp;&nbsp;<input class="easyui-validatebox"  name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
		作者：&nbsp;&nbsp;<input class="easyui-validatebox" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
		</td>
		<td>
		出版社：&nbsp;<input class="easyui-validatebox"  name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
		&nbsp;销量：&nbsp;&nbsp;<input class="easyui-validatebox"  type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
		</td></tr>
		<tr><td>
		顾客评分：<input class="easyui-validatebox"  name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
		编辑推荐：<input class="easyui-validatebox"  name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
		</td>
		<td>
		类别所属：<select id="prosele1" name="cid"></select><br/><br/>
		简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" ></textarea><br/><br/>
		</td>
		</tr>
		</table>
		<center>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro1()">确认</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
		</center>
	</form>
	</div>
	<div id="updateProdia" class="easyui-dialog" data-options="closed:true">
	<form id="prof2" style="margin:30px" enctype="multipart/form-data" method="post">
	<table>
		<tr>
		<td>
		<input id="proId" name="book_id" type="hidden"/>
		图书名字：<input class="easyui-validatebox" id="proName" name="book_name" data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
		图书封面：<input class="easyui-filebox"  name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>
		</td>
		<td>
		图书原价：<input class="easyui-validatebox" id="proPrice" name="book_price" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
		当当价格：<input class="easyui-validatebox" id="dangPrice" name="Dangprice" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
		</td>
		</tr>
		<tr><td colspan="2"><p id="image"></p></td></tr>
		<tr><td>
		库存：&nbsp;&nbsp;<input class="easyui-validatebox" id="inventory" name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
		作者：&nbsp;&nbsp;<input class="easyui-validatebox" id="author" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
			</td>
			<td>
		出版社：&nbsp;<input class="easyui-validatebox" id="press" name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
		销量：&nbsp;&nbsp;<input class="easyui-validatebox" id="salenum" type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
		</td></tr>
		<tr><td>
		顾客评分：<input class="easyui-validatebox" id="custome_core" name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
		编辑推荐：<input class="easyui-validatebox" id="recommend" name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
		</td><td>
		类别所属：<select id="prosele" name="cid"></select><br/><br/>
		简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" id="messages"></textarea><br/><br/>
			</td>
		</tr>
	</table>
		<center>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro();">确认</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onClick="exit();">取消</a>
		</center>
	</form>
	</div>
	<script type="text/javascript">
	
	</script>
</body>
</html>