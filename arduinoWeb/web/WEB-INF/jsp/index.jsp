<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>
    <body>

        <h1 style="background-color: #04519b; color: #f9f9f9;"> BugBounty </h1>
        <div align="center">
            <form action="LoginServlet" method="POST">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">
                            <form class="form-horizontal">
                                <fieldset>
                                    <legend>LOGIN</legend>
                                    <div class="form-group">
                                        <label for="username" class="col-lg-2 control-label">USERNAME</label>
                                        <div class="col-lg-10">
                                            <input type="text" class="form-control" name="username" placeholder="Username">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-lg-2 control-label">PASSWORD</label>
                                        <div class="col-lg-10">
                                            <input type="password" class="form-control" name="password" placeholder="Password">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox"> Remember password
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                            <button type="reset" class="btn btn-default">Cancel</button>
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>

                    </div>
                </div>
            </form>
            <p style="color: red"> ${login} </p>
        </div>
    </body>

</html>
