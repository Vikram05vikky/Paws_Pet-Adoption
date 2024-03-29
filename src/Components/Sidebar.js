import React from "react";
import "../Assets/Sidebar.css";
import { Dog } from "lucide-react";
import { Cat } from "lucide-react";
import { LogOut } from "lucide-react";
import { Link } from "react-router-dom";
import img1 from "../Assets/Img/Logo.png";
import "@fortawesome/fontawesome-free/css/all.css";
function Sidebar() {
  return (
    <div>
      <div className="button-container">
        <nav className="n1"></nav>

        <button className="button">
          <Link to="/Home" style={{ textDecoration: "none", color: "white" }}>
            Home
          </Link>
        </button>
        <button className="button">
          <Link
            to="/Stories"
            style={{ textDecoration: "none", color: "white" }}
          >
            Stories
          </Link>
        </button>
        {/* <button className="button">
          <Link to="/About" style={{ textDecoration: "none", color: "white" }}>
            About
          </Link>
        </button> */}
        <button className="button">
          <Link
            to="/Contact"
            style={{ textDecoration: "none", color: "white" }}
          >
            Contact
          </Link>
        </button>
        <button className="button" style={{ color: "black" }}>
          ...
        </button>
      </div>
      <nav className="lnav">
        <img
          src={img1}
          alt="dog"
          style={{ position: "absolute", top: -15, left: 0, height: "100px" }}
        ></img>
        <br></br>
        <span className="item" data-text="Dog">
          <Link to="/Dog">
            <Dog size={48} style={{ textDecoration: "none", color: "white" }} />
          </Link>
        </span>
        <span className="item" data-text="Cat">
          <Link to="/Cat">
            <Cat size={48} style={{ textDecoration: "none", color: "white" }} />
          </Link>
        </span>
        <span className="ite">
          <Link to="/Others" style={{ textDecoration: "none" }}>
            <h6
              style={{
                fontSize: "20px",
                textDecoration: "none",
                color: "white",
              }}
            >
              Others
            </h6>
          </Link>
          {/* <h6>Others</h6> */}
        </span>

        <span className="item" data-text="Logout">
          <Link to="/">
            <LogOut
              size={48}
              style={{ textDecoration: "none", color: "white" }}
            />
          </Link>
        </span>
      </nav>
    </div>
  );
}

export default Sidebar;
