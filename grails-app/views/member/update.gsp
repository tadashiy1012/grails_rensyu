<html>
  <head>
    <title>member update</title>
  </head>
  <body>
    <h1>member update</h1>
    <g:form name="updateForm" url="[controller:'member',action:'execUpdate']">
      <g:hiddenField name="id" value="${tgt.id}" />
      <g:textField name="name" value="${tgt.name}" />
      <g:submitButton name="submit">submit</g:submitButton>
    </g:form>
  </body>
</html>