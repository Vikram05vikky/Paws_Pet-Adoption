import React from "react";
import "../Assets/Contact.css";
import cooo from "../Assets/Img/contact.png";
import Sidebar from "./Sidebar";
function Contact() {
  return (
    <>
      <div className="cont1">
        <img src={cooo} alt="img" className="coim" />
      </div>
      <Sidebar />
      {/* <Footer /> */}
    </>
  );
}

export default Contact;
