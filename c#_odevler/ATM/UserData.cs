namespace CSharp_works.ATM
{
    public class UserData
    {
        List<User> _users;
        public UserData()
        {
            _users = new List<User>
            {
                new User { Name = "kadir", Password = "12345" },
                new User { Name = "hasan", Password = "54321" },
                new User { Name = "Ali", Password = "12345" },
                new User { Name = "Veli", Password = "12345" },
            };
        }
        public void Add(User user)
        {
            _users.Add(user);
        }
        public List<User> GetUsers()
        {
            return _users;
        }
        public User Get(string userName)
        {
            return _users.Find(x => x.Name == userName);
        }
    }
}
