const todo={name:"",isActive:false,order:0};

var todoList=JSON.parse(localStorage.getItem("todoList"));

window.onload = ()=>{

    if(!todoList || todoList.length==0)
    {
        todoList = [
          { id: 0, name: "3 Litre Su İç", isActive: true, order: 5 },
          { id: 1, name: "Ödevleri Yap", isActive: true, order: 1 },
          { id: 2, name: "En Az 3 Saat Kodlama Yap", isActive: true, order: 2 },
          { id: 3, name: "Yemek Yap", isActive: true, order: 0 },
          { id: 4, name: "50 Sayfa Kitap Oku", isActive: true, order: 4 },
        ];

        localStorage.setItem("todoList", JSON.stringify(todoList));
    }

    todoList.sort((a,b)=>a.order>b.order?1:-1);
    todoList.map((a) => {
      AddToArray(a);
    });
};


function DoEvent(e)
{
    if (e.target !== this)
    return;
    var event = todoList.filter((a) => a.id == this.id)[0];
    if (event.isActive) {
        this.classList.add("bg-success");
            this.style.textDecoration= "Line-Through";
    } else {
        this.classList.remove("bg-success");
        this.style.textDecoration= "none";
    }
        event.isActive = !event.isActive;

        localStorage.setItem("todoList", JSON.stringify(todoList));
}


function newElement()
{
    var text = document.querySelector("#task").value;
    if(!text.trim())
    {
      alert("Görev bilgisi giriniz.");
      return;
    }
    var last=todoList.sort((a,b)=>a.order>b.order?1:-1).slice(-1)[0];
    var newE = {
      id: (last.id + 1),
      name: text,
      isActive: true,
      order: (last.order + 1),
    };
    todoList.push(newE);
    localStorage.setItem("todoList", JSON.stringify(todoList));
    AddToArray(newE);   
    
    document.querySelector("#task").value="";
}

function removeElement(s)
{
    console.log(s.parentNode);
    var event = todoList.filter((a) => a.id == s.parentNode.id)[0];
    var ulDom = document.querySelector("#list");
    s.parentNode.parentNode.removeChild(s.parentNode);

    todoList.pop(event);
    localStorage.setItem("todoList", JSON.stringify(todoList));    
}


function AddToArray(a)
{
    var ulDom = document.querySelector("#list");
    var li=document.createElement("li");
        li.id = a.id;
        li.classList.add("row","justify-content-between");
        if(!a.isActive)
            {
                li.classList.add("bg-success");
            li.style.textDecoration= "Line-Through";
        }
        li.addEventListener("click", DoEvent);
        li.innerHTML =`${a.name} <span onclick="removeElement(this)" id="liveToastBtn" class="button">İptal</span>`;
        ulDom.append(li);
}


