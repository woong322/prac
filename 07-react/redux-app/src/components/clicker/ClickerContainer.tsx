import * as React from "react";
import { connect } from "react-redux";
import { ClickerMapper } from "../../redux/actions/ClickerAction";
import { IAppState } from "../../redux/state";
import ClickerComponent from "./ClickerComponent";

const mapStateToProps = (state: IAppState) => {
  return {
    count: state.clickerState.count,
  };
};

const mapDispatchToProps = {
  increment: ClickerMapper,
};


export default connect(mapStateToProps, mapDispatchToProps)(ClickerComponent);