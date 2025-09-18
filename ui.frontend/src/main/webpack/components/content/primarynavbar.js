const navItems = document.querySelectorAll(".mega-nav__link");
const siteHeader = document.querySelector(".site-header");
const panelSections = document.querySelectorAll(".panel-section");

navItems.forEach((link) => {
  link.addEventListener("click", (e) => {
    e.preventDefault();
    const targetId = link.getAttribute("data-target");
    const parentItem = link.parentElement;

    if (parentItem.classList.contains("active")) {
      parentItem.classList.remove("active");
      siteHeader.classList.remove("panel-open");
      panelSections.forEach((sec) => sec.classList.remove("active"));
      return;
    }

    document
      .querySelectorAll(".mega-nav__item")
      .forEach((item) => item.classList.remove("active"));
    panelSections.forEach((sec) => sec.classList.remove("active"));

    parentItem.classList.add("active");
    siteHeader.classList.add("panel-open");
    document.getElementById(targetId).classList.add("active");
  });
});

document.addEventListener("click", (e) => {
  if (!e.target.closest(".site-header")) {
    document
      .querySelectorAll(".mega-nav__item")
      .forEach((item) => item.classList.remove("active"));
    siteHeader.classList.remove("panel-open");
    panelSections.forEach((sec) => sec.classList.remove("active"));
  }
});
