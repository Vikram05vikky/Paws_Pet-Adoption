import "../Assets/Sidebar.css";
import { Link } from "react-router-dom";
import "@fortawesome/fontawesome-free/css/all.css";
import img1 from "../Assets/Img/Logo.png";
function PPNav() {
  return (
    <div>
      <div className="button-container">
        <nav className="n1"></nav>
        <img
          src={img1}
          alt="img"
          style={{ position: "absolute", top: -15, left: 0, height: "100px" }}
        ></img>
        <button className="button">
          <Link to="/Login" style={{ textDecoration: "none", color: "white" }}>
            Login
          </Link>
        </button>
        <button className="button">
          <Link
            to="/Register"
            style={{ textDecoration: "none", color: "white" }}
          >
            Register
          </Link>
        </button>

        <button className="button" style={{ color: "black" }}>
          ...
        </button>
      </div>
    </div>
  );
}

export default PPNav;
