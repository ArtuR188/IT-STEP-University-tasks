import './style.css';


const ToDoInputComponent = () => {


 return (
  <div className='todo-input'>
   <input type="text" placeholder="Add item..." />
   <button type="submit" class="add">
    Add
   </button>
   <button type="button" class="add hide">
    Update
   </button>
   <div id="search">
    <input type="text" placeholder="Search" />
    <span>X</span>
   </div>
   <button type="button">Search</button>
  </div>
 );
};

export default ToDoInputComponent;