import React from 'react';

function HtmlAttributes(props){
    return (
        /*
            some of the HTML attributes that you already know are executed slightly differently in JSX.
            For example "class" has become "className"

            style="string" has become    style = {{attr1: value, etc}}

            Style has two curly braces because the style attribute now takes an object as its value;
            and you need interpoltation "{}" to pass an object "{}"

            There are more slightly differences, just be careful.
        */
        <React.Fragment>
            HtmlAttributes Component starts here:
        <button className="btn btn-success"
            style={{
                color: "blue"
            }}
        >From HtmlAttribute</button>
        </React.Fragment>
    );
}

export default HtmlAttributes;