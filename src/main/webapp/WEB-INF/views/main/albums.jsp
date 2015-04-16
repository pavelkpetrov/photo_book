<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div style="position:absolute; margin-left:95px">
    <button class="btn btn-primary" ng-disabled="mySwitch" ng-click="showStart()">
        <span class="glyphicon"></span><spring:message key="main.page.create.photo.boock.btn"/>
    </button>
</div>

<div class="template-selector" id="template-selector" align="center">

    <div style="position:relative;">
        <h1><i><spring:message key="main.page.create.choose.theme"/></i></h1>
    </div>

    <table style="top:0px">
        <tbody>
        <tr>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-0" src="${pageContext.request.contextPath}/templates/frame2.png" width="250" height="250"/>
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-1" src="${pageContext.request.contextPath}/templates/frame1.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-2" src="${pageContext.request.contextPath}/templates/frame.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-3" src="${pageContext.request.contextPath}/templates/frame2.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
        </tr>

        <tr>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-4" src="${pageContext.request.contextPath}/templates/frame.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-5" src="${pageContext.request.contextPath}/templates/frame2.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-6" src="${pageContext.request.contextPath}/templates/frame1.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-7" src="${pageContext.request.contextPath}/templates/frame2.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
        </tr>

        <tr>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-8" src="${pageContext.request.contextPath}/templates/frame.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-9" src="${pageContext.request.contextPath}/templates/frame1.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-10" src="${pageContext.request.contextPath}/templates/frame.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
            <td class="cell" align="center">
                <div class="theme-template">
                    <button ng-click="enableButton()">
                        <img class="templates" id="template-11" src="${pageContext.request.contextPath}/templates/frame2.png" width="250" height="250"
                             style="visibility: visible;">
                    </button>
                </div>
            </td>
        </tr>

        </tbody>
    </table>
</div>