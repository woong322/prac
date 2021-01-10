import React, { FormEvent, SyntheticEvent, useState } from "react";

interface IProps {}

export const ImageComponent: React.FC<IProps> = (props: IProps) => {
  const [imgSrc, setImgSrc] = useState(
    "https://previews.123rf.com/images/tigatelu/tigatelu1704/tigatelu170400024/76841493-vector-illustration-of-cartoon-funny-tooth-character-posing.jpg"
  );

  const submitUrl = (eve: SyntheticEvent<HTMLFormElement>) => {
    eve.preventDefault();
    const { imgVal } = eve.currentTarget;
    setImgSrc(imgVal.value);
  };

  return (
    <div>
      <form onSubmit={(eve) => submitUrl(eve)}>
        <input type="text" name="imgVal" />
        <input type="submit" value="submit" />
      </form>
      <img
        style={{ width: "100px", height: "100px" }}
        src={imgSrc}
        alt="no teeth found"
      />
    </div>
  );
};
