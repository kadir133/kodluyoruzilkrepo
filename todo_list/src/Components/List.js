import ListItem from "./ListItem";

function List({ todoList, removeItem, doEvent }) {
    const sortedList =
    todoList && todoList.length > 1
      ? todoList.sort((a, b) => (a.order > b.order ? 1 : -1))
      : todoList;

  return (
    <>
      <ul>
        {sortedList &&
          sortedList.map((a) => (
            <ListItem key={a.id} obj={a} doEvent={doEvent} removeItem={removeItem} />
          ))}
      </ul>
    </>
  );
}

export default List;
