<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Aliens Hub</title>
    <style>
      * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
      }

      body {
        overflow: hidden;
        width: 100vw;
        height: 100vh;
      }

      .container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width: 100%;
        height: 100%;
      }

      .container h1 {
        font-size: 7rem;
        color: rgba(0, 0, 0, 0.7);
        margin-bottom: 20px;
        line-height: 1.5;
        user-select: none;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>${alien.aname}</h1>
    </div>
  </body>
</html>
