import React from "react";
import "../Assets/Login.css";
import "react-toastify/dist/ReactToastify.css";
import { useNavigate } from "react-router-dom";
import LRNav from "./LRNav";
const Login = () => {
  const move = useNavigate();
  const Signin = () => {
    let a = document.getElementById("name").value;
    let b = document.getElementById("pass1").value;

    if (a !== "admin" && b !== "123") {
      alert("Username / Password invalid");
    } else if (a !== "admin" || b !== "123") {
      alert("Username / Password invalid");
    } else {
      move("/Home");
    }
  };

  const show = () => {
    move("/Register");
  };

  return (
    <div className="v1">
      <LRNav />
      <body className="b1">
        <form class="container" onSubmit={Signin}>
          <h2>Login</h2>
          <input
            type="text"
            name=""
            id="name"
            className="name"
            placeholder="Name"
            required
          />

          <input
            type="password"
            name=""
            id="pass1"
            className="name"
            placeholder="Password"
            required
          />

          <button class="btn1">Login</button>

          <button class="btn1" onClick={show}>
            Register
          </button>

          <h1> Username : admin</h1>
          <h1> Password : 123</h1>
        </form>
      </body>
    </div>
  );
};

export default Login;
