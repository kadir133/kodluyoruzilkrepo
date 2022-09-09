const unique = (value, index, self) => {
    return self.indexOf(value) === index
  }

let categories = menu.map(a => a.category).filter(unique);
categories.unshift("All");

let btnDom=document.querySelector("#btn-container");
categories.forEach(a=> {

    var btn=document.createElement("button");
    btn.innerText=a;
    btn.id=a;
    btn.classList.add("btn-item");
    btn.addEventListener("click", () => ShowMenuItems(a));
    btnDom.append(btn);
});



function ShowMenuItems(e)
{    
    [].slice.call(document.getElementsByClassName("btn-item")).forEach(a=>{
        a.style.background="";
        a.style.color="black";
    });
    document.querySelector("#"+e).style.background="gray";
    document.querySelector("#"+e).style.color="white";

    let itemDom=document.querySelector("#item-container");
    var items= e=="All"?menu:menu.filter(a=>a.category==e);

    itemDom.innerHTML="";
    items.forEach(a=>{
    var li=document.createElement("li");
    li.style.listStyle="none";
    li.classList.add("col-6","menu-items");
    li.innerHTML=    
    `
        <img class="photo" src=${a.img}></img>
        <div class="menu-info">
        <div class="menu-title">
            <h4>${a.title}</h4>
            <h4>${a.price}</h4>
        </div>
        <p class="menu-text">${a.desc}</p>
        </div>
    ` 
    itemDom.append(li);
});
}


ShowMenuItems("All")





















