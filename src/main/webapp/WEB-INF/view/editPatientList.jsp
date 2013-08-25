<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 hibernate integration example on www.howtodoinjava.com</title>
</head>
<body>
  
<h2>Employee Management Screen : Spring 3 hibernate integration example on www.howtodoinjava.com</h2>
  
<form:form method="post" action="add" commandName="patient">
  
    <table>
    <tr>
        <td><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td><form:label path="dateOfBirth"><spring:message code="label.dateOfBirth"/></form:label></td>
        <td><form:input path="dateOfBirth" /></td>
    </tr>
    <tr>
        <td><form:label path="gender"><spring:message code="label.gender"/></form:label></td>
        <td><form:input path="gender" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.addrLine1"><spring:message code="label.addrLine1"/></form:label></td>
        <td><form:input path="addrLine1" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.addrLine2"><spring:message code="label.addrLine2"/></form:label></td>
        <td><form:input path="addrLine2" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.city"><spring:message code="label.city"/></form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.district"><spring:message code="label.district"/></form:label></td>
        <td><form:input path="district" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.state"><spring:message code="label.state"/></form:label></td>
        <td><form:input path="state" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.pincode"><spring:message code="label.pincode"/></form:label></td>
        <td><form:input path="pincode" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.phoneNumber"><spring:message code="label.phoneNumber"/></form:label></td>
        <td><form:input path="phoneNumber" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.email"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.phoneType"><spring:message code="label.phoneType"/></form:label></td>
        <td><form:input path="phoneType" /></td>
    </tr>
    <tr>
         <td><form:label path="patientAddress.addressType"><spring:message code="label.addressType"/></form:label></td>
        <td><form:input path="addressType" /></td>
    </tr>
     <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
  
      
<h3>Patients</h3>
<c:if  test="${!empty patientList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Telephone</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${patientList}" var="patient">
    <tr>
        <!-- <td>${patient.lastname}, ${patient.firstname} </td>
        <td>${patient.email}</td>
        <td>${patient.telephone}</td> -->
        <td><a href="delete/${patient.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
  
</body>
</html>