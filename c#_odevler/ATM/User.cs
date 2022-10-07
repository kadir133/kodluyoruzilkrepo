using System.Text;

namespace CSharp_works.ATM
{
    public class User : IDisposable
    {
        public string Name { get; set; }
        public string Password { get; set; }
        public int Right { get; set; } = 5;
        public int MyProperty { get; set; }

        private StreamWriter logFileWriter;
        private FileStream logFile;
        public void OpenLogFile()
        {
            string dir = AppDomain.CurrentDomain.BaseDirectory + "\\Atm\\";
            string name = dir + Name + "_EOD_" + DateTime.Now.ToString("ddMMyyyy") + ".log";
            if (Directory.Exists(dir) == false)
                Directory.CreateDirectory(dir);

            logFile = new FileStream(name, FileMode.Open, FileAccess.ReadWrite);
            logFileWriter = new StreamWriter(logFile);
            logFileWriter.AutoFlush = true;
            logFileWriter.WriteLine(DateTime.Now.ToString("dd.MM.yyyy HH:mm:ss") + " -- atm v.20220101 started.");
        }

        public void WriteTransaction(string trans)
        {
            logFileWriter.WriteLine(DateTime.Now.ToString("dd.MM.yyyy HH:mm:ss") + new string(' ', 5) + "> " + trans);
        }

        public string ReadLogs()
        {
            StreamReader cfgFileReader = new StreamReader(logFile);
            return cfgFileReader.ReadToEnd();
        }

        public void CloseLogFile()
        {
            logFileWriter.Close();
        }

        public void Dispose()
        {
            CloseLogFile();
            GC.SuppressFinalize(this);
        }
    }
}
