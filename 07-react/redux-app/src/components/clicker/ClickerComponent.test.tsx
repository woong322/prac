import Enzyme, { shallow } from 'enzyme';
import Adapter from 'enzyme-adapter-react-16';
import ClickerComponent from './ClickerComponent';

Enzyme.configure({ adapter: new Adapter() });


describe('this is a test suite. I will use it to take over the world, wait I mean to test my component', () => {
    it('should render without error', () => {
        const wrapper = shallow(<ClickerComponent count={10} increment={(n:number) => console.log(n)}/>);
        // console.log(wrapper.debug());
        expect(wrapper.find('button').text()).toBeTruthy();
    });

    it('should rerender when the props change', () => {
        const wrapper = shallow(<ClickerComponent count={1} increment={n => console.log(n)}/>);
        const first = Number(wrapper.find('button').text());
        wrapper.setProps({count: 2});
        const second = Number(wrapper.find('button').text());
        const diff = second - first;
        expect(diff).toBe(1);
    })
})