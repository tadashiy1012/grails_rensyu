<html>
  <head>
    <title>member create</title>
  </head>
  <body>
    <h1>member create</h1>
    <g:form name="createForm" url="[controller:'member',action:'execCreate']">
      <g:textField name="name" value="${name}" />
      <g:submitButton name="submit">submit</g:submitButton>
    </g:form>
  </body>
</html>