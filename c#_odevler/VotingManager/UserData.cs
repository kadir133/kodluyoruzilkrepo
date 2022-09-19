namespace CSharp_works.VotingManager
{
    public class UserData
    {
        List<User> _users;
        public UserData()
        {
            _users = new List<User>
            {
                new User { Id = 1, UserName = "Serhat", Password = "12345" },
                new User { Id = 2, UserName = "Serkan", Password = "54321" },
                new User { Id = 3, UserName = "Ali", Password = "12345" },
                new User { Id = 4, UserName = "Veli", Password = "12345" },
                new User { Id = 5, UserName = "Deli", Password = "12345" },
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
            return _users.Find(x => x.UserName == userName);
        }
    }
}
