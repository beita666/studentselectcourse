<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${list.name}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <li id="admin-index"><a
                    <%--href="${pageContext.request.contextPath}/pages/student-main.jsp">--%>
                href="#">
                <i class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
                <span>个人中心</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>


            </a>
                <ul class="treeview-menu">

                    <li id="student-message"><a
                            href="${pageContext.request.contextPath}/student/findOne?studentNum=${list.studentNum}"> <i
                            class="fa fa-circle-o"></i> 个人信息
                    </a></li>
                    <li id="student-score"><a
                            href="${pageContext.request.contextPath}/role/findAll.do"> <i
                            class="fa fa-circle-o"></i> 成绩
                    </a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>课程中心</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="history-course"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 历史课程
                    </a></li>
                    <li id="new-course"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 本学期课程
                    </a></li>
                    <li id="selected-course"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 已选课程
                    </a></li>
                    <li id="unselect-course"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 未选课程
                    </a></li>

                </ul></li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>