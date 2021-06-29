//@types/jest

test('Compiling android code goes on as expected',()=>{
    const val='Brian is my name'
    expect(val).toContain('Brian')
});