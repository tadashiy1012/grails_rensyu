<html>
  <head>
    <title>member delete</title>
  </head>
  <body>
    <h1>member delete</h1>
    <g:form name="deleteForm" url="[controller:'member',action:'execDelete']">
      <g:textField name="id" value="${id}" placeholder="input delete target id" />
      <g:submitButton name="submit">submit</g:submitButton>
    </g:form>
  </body>
</html>