namespace CSharp_works.VotingManager
{
    public class UserController
    {
        readonly UserData data = new();
        public bool CheckUser(string userName)
        {
            return data.Get(userName) != null;
        }

        public bool CheckPassword(string userName, string password)
        {
            User user = data.Get(userName);

            if (user.Password == password)
            {
                return true;
            }
            else return false;

        }
        public bool AddUser(string userName, string password)
        {
            if (data.Get(userName) != null)
            {
                return false;
            }
            else
            {
                data.Add(new User { Id = data.GetUsers().Count + 1, UserName = userName, Password = password });
                return true;
            }
        }
    }
}
