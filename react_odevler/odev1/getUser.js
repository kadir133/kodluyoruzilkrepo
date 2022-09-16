import axios from "axios";

async function getUser(id) {
  const { data: user } = await axios(
    "https://jsonplaceholder.typicode.com/users/" + id
  );

  const { data: post } = await axios(
    "https://jsonplaceholder.typicode.com/posts?userId=" + id
  );
  user.posts=post;
  return user;
}

export default getUser;