<html>
  <head>
    <title>member list</title>
  </head>
  <body>
    <h1>member list</h1>
    <ul><g:each in="${all}" var="item">
      <li>
        <span>${item.id}</span>
        <span>:</span>
        <span>${item.name}</span>
      </li>
    </g:each></ul>
  </body>
</html>