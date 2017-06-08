<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>Send a JMS Message</title>
  <link rel="stylesheet" href="style.css" type="text/css">
</head>

<body>
<h1>Send a JMS Message</h1>

<form action="message/FOO/BAR" method="post">
  <p>
    <label for="destination">Destination name</label>
    <input type="text" name="destination" value="FOO.BAR"/>
  </p>
  <p>
    <label for="type">Destination Type: </label>
    <select name="type">
      <option selected value="queue">Queue</option>
      <option value="topic">Topic</option>
   </select>
  </p>
  <p>
    <textarea name="body" rows="30" cols="80">
Enter some text here for the message body...
    </textarea>
  </p>
  <p>
    <input type="submit" value="Send"/>
    <input type="reset"/>
  </p>
</form>

</body>
</html>
