import * as React from 'react';

interface IEDLoginProps {
}

const EDLogin: React.FunctionComponent<IEDLoginProps> = (props) => {

    const login = (eve: React.SyntheticEvent<HTMLFormElement>) => {
        eve.preventDefault();
        const {username} = eve.currentTarget;
        localStorage.setItem('username',username.value);
    }
  return (
      <form onSubmit={eve => login(eve)}>
          <input type="text" name="username"/>
          <input type="submit" value="login"/>
      </form>
  );
};

export default EDLogin;
