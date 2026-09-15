
import './style.css';

const TodoList = () => {
 
    const handleDeleteTodo = (index) => {
      const updatedTodos = [...todos];
      updatedTodos.splice(index, 1);
      setTodos(updatedTodos);
    };
  
    return (
      <div>
        {todos.map((todo, index) => (
          <div key={index}>
            <span>{todo.text}</span>
            <button onClick={() => handleDeleteTodo(index)}>Delete</button>
          </div>
        ))}
     
      </div>
    );
  };
  
  export default TodoList;
  
  