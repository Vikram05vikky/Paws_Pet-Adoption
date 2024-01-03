import "../Assets/Nav.css";
import { Link } from "react-router-dom";
import img1 from "../Assets/Img/Logo.png";
const Nav = () => {
  return (
    <body className="ho">
      <header>
        <img
          src={img1}
          alt="img"
          style={{ position: "absolute", top: 0, left: 0, height: "100px" }}
        ></img>
        <h2 style={{ color: "white", fontWeight: "40px" }}>Paws</h2>
        <div class="navigation">
          <span className="info-btn">
            <Link style={{ color: "white" }} to="/Login">
              Login
            </Link>
          </span>
          <span className="info-btn">
            <Link style={{ color: "white" }} to="/Register">
              Register
            </Link>
          </span>
        </div>
      </header>
    </body>
  );
};

export default Nav;
