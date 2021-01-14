
export const ClickerActions = {
    INCREASE_COUNT: 'INCREASE_COUNT'
}

export const ClickerMapper = (num: number) => {
    return {
        type: ClickerActions.INCREASE_COUNT,
        payload: {
            count: num
        }
    }
}