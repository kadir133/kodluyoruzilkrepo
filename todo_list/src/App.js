import "./App.css";
import { useState, useEffect } from "react";
import List from "./Components/List";
import Form from "./Components/Form";

function App() {
  var storage=JSON.parse(localStorage.getItem("todoList"));
  const [todoList, setTodo] = useState(storage ? storage : []);

  const addItem = (item) => {
    var last = todoList.slice(-1)[0]; 
    item.id = last ? last.id + 1 : 1;
    item.order = todoList.length + 1;    
    setTodo([...todoList, item]);
  };

  const removeItem = (id) => { 
    var filtered = todoList.filter((x) => {return x.id !== Number(id);});
    console.log([id, filtered]);
    setTodo(filtered);
  };

  const doEvent = (id) => {    
    const newState = todoList.map(obj => {
      if (obj.id === Number(id)) {
        return {...obj, isActive: !obj.isActive};
      }
      return obj;
    });

    setTodo(newState);
  };

  useEffect(() => {
    var list=todoList&& todoList.length>1?todoList.sort((a, b) => (a.id > b.id ? 1 : -1)):todoList;
    localStorage.setItem("todoList", JSON.stringify(list));
  }, [todoList]);

  return (
    <div className="App">
      <div className="container">
        <div className="header">
          <img
            src="https://cdn.sanity.io/images/9kdepi1d/production/65c832d202a503b15d99e628f4313782f3ef50db-300x62.png"
            className="mb-1"
            alt=""
          />
          <h2>Yapılacaklar Listesi</h2>
          <Form addItem={addItem} />{" "}
        </div>

        <List todoList={todoList} removeItem={removeItem} doEvent={doEvent} />

        <script src="/todo/script.js"></script>
      </div>
    </div>
  );
}

export default App;
