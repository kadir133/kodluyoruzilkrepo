import { useState } from "react";

const initialFormValue = { id: 0, name: "", isActive: false, order: 0 };
function Form({ addItem }) {
  const [form, setForm] = useState(initialFormValue);

  const onChangeInput = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value,
    });
  };

  const onSubmit = (e) => {
    e.preventDefault();
    
    if(!form.name.trim())
    {
      return;
    }
    
    addItem(form);
    setForm(initialFormValue);
  };

  return (
    <>
      <form onSubmit={onSubmit}>
        <div className="row justify-content-between">
          <input
            type="text"
            name="name"
            placeholder="What needs to be done?"
            value={form.name}
            onChange={onChangeInput}
          ></input>
          <button className="button">Add</button>
        </div>
      </form>
    </>
  );
}

export default Form;
