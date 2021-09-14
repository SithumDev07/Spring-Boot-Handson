<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
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

      form input {
        border: none;
        border-bottom: 1px solid rgba(0, 0, 0, 0.7);
        color: rgba(0, 0, 0, 0.7);
        font-size: 1.6rem;
        padding: 10px 20px;
        margin-bottom: 20px;
      }

      form input:focus {
        outline: none;
      }

      form {
        display: flex;
        flex-direction: column;
      }

      form button {
        width: 100%;
        height: 55px;
        border: none;
        background-color: rgba(0, 0, 0, 0.7);
        color: white;
        font-size: 1.5rem;
        cursor: pointer;
      }

      form button:hover {
        background-color: rgba(0, 0, 0, 0.6);
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Aliens Hub</h1>
      <form action="addAlien">
        <input name="aid" type="text" placeholder="Id" />
        <input name="aname" type="text" placeholder="Name" />
        <button type="submit">Enter</button>
      </form>
    </div>
  </body>
</html>
