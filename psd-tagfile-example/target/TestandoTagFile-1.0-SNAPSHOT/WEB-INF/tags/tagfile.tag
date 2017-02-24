<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute description="Numero inicial" name="begin" required="true" type="Integer"%>
<%@attribute description="Numero Final" name="end" required="true" type="Integer"%>

<c:forEach begin="${begin}" end="${end}" var="i">
   <p> <jsp:doBody /> </p>
</c:forEach>
