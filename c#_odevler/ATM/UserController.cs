namespace CSharp_works.ATM
{
    public class UserController
    {
        readonly UserData data = new();
        public User CheckUser(string userName)
        {
            return data.Get(userName);
        }

        public bool CheckPassword(string userName, string password)
        {
            User user = data.Get(userName);

            user.Right -= user.Password == password ? 0 : 1;

            return user.Password == password;
        }
        public (bool, User?) AddUser(string userName, string password)
        {
            if (data.Get(userName) != null)
            {
                return (false, null);
            }
            else
            {
                var user = new User { Name = userName, Password = password };
                data.Add(user);
                return (true, user);
            }
        }
    }
}
