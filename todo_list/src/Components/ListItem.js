function ListItem({ obj, doEvent,removeItem }) {
  const onCheck = (e) => {
    doEvent(e.target.id);
  };

  const onRemoveClick = (e) => {
    console.log(e.target.id);
    removeItem(e.target.id);
  };

  return (
    <>
      <li className={`${obj.isActive ? "bg-secondary " : ""}`}>
        <div className="row">
          <input
            type="checkbox"
            id={obj.id}
            className="col-1"
            checked={obj.isActive}
            onChange={onCheck}
          />
          <span className={`${obj.isActive ? "text-light " : ""}` + "col-8 align-self-center"}>
            {obj.isActive ? <s>obj.name</s> : obj.name}
          </span>
          <input
            type="submit"
            value="Sil"
            id={obj.id}
            className="button col-3"
            onClick={onRemoveClick}
          />
        </div>
      </li>
    </>
  );
}

export default ListItem;
