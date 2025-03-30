/*

React is a Ui lib to making complex Ui application using a declative approach.

Component based design
uses virtual dom, not real dom
unidirection data flow (top to down)

--> JSX

Javascript xml

const element = <h1> hello </h1>

self closing like img

under the hood  : const element = React.createElement("h1",null,"hello");

-must be single parent
-{varibale_name}
-cant use if, for, etc
-Use className instead of class (since class is a reserved JavaScript keyword)

-->Components in react

basic building block, contains states, and UI 

: class based
: function based

functional example :


const DashBoard = ()=>{
    return <>
          <h1>I am Dashboard </h1>
    </>
    
    }

export default DashBoard;


class component : 

class Greeting extends Component {
   render(){
    return <h1>Hello, {this.props.name} !</h1>
   }


}



--->props and state :

state : contain by component
props: based to other component : 
props are immutable, means they cant be changed inside child component
dont try to change prop


alert alert :
 State updates are asynchronous
React batches multiple setState calls for performance reasons.


setCount(count + 1);
setCount(count + 1);
setCount(count + 1);

---use 
setCount(prevCount => prevCount +1);

eg :
--STATE :

const Counter = ()=>{

    const [counter, useCounter] = React.useState(0);
    return <>
         <button onClick={()=>{useCounter(counter+1)}}> click mw </button>
         <span> count : {counter} </span>
    </>
    
    }

--PROP : 
const Welcome = ({name})=>{
    return <h1>Welcome {name}</h1>
}


-------
class Counter extends Component{
    constructor(props){
      super(props);             //from parent props;
      this.state = {
             count : 0          //add state here
      }
    }

    increment = ()=>{
              this.setState({count : this.state.count + 1});         //use setState    
    };


    render(){
        return(
            <div>
                    <p> count : {this.state.count} </p>
                    <button onClick={this.increment}> Increase </button>           //keep in mind, as its class based so we need to use this   to under the context of element

            </div>
        
        )
    
    
    
    }



}

---------------------------------

React has :

hooks (fnxl component)
Life cycle methods (class component)

1) useEffect is eqvl to componentDidMount, componentDidUpdate

useEffect(()=>{
    //on start
    },[])

//if passed anything inside [] then on its change whether state or prop



---Events :

are camelCase and require a function
onClick={()=> alert("clicked")}


--condition rendering

(isTrue) && <h1> yes its true</h1>

{isTrue ? <h1> yes its true </h1> : <h1>no its not true</h1>}

--List and keys :

const users = ["alice", "bob", "fanny"]

<ul>
   {user.map((ele,index)=>
    <li key={index}> ele </li>
    )}

</ul>


-- context API (global state)

need details :











*/