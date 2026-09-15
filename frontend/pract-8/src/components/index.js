
const TodoList = () => {
  
    const [searchTerm, setSearchTerm] = useState('');
  
    const handleSearch = () => {
      
    };
  
    const handleClearSearch = () => {
      setSearchTerm('');
    };
  
    return (
      <div>
        <input
          type="text"
          value={searchTerm}
          onChange={(e) => setSearchTerm(e.target.value)}
        />
        <button onClick={handleSearch}>Search</button>
        <button onClick={handleClearSearch}>Clear Search</button>
      
      </div>
    );
  };
  
  export default TodoList;
  