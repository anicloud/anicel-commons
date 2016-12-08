package com.ani.octopus.commons.stub.domain;

import com.ani.octopus.commons.stub.dto.StubArgumentDto;
import com.ani.octopus.commons.stub.dto.StubArgumentInfoDto;
import com.ani.octopus.commons.stub.type.DataType;
import com.ani.utils.core.AniGeneralUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubArgument implements Serializable{

    private static final long serialVersionUID = 3279913717029887609L;

    public DataType dataType;

    public String name;

    public boolean isRequired;

    public StubArgument(){}

    public StubArgument(DataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
        this.isRequired = true;
    }

    public StubArgument(DataType dataType, String name ,boolean isRequired) {
        this.dataType = dataType;
        this.name = name;
        this.isRequired = isRequired;
    }


    public StubArgumentInfoDto toInfoDto(){
        return new StubArgumentInfoDto(
                this.dataType,
                this.name
        );
    }

    public static List<StubArgumentInfoDto> batchToInfoDto(List<StubArgument> stubsArgument) {
        if (AniGeneralUtils.isCollectionEmpty(stubsArgument)) return new ArrayList<>(0);
        List<StubArgumentInfoDto> stubsArgumentDto = new ArrayList<>(stubsArgument.size());
        for (StubArgument oneStubArg : stubsArgument) {
            if (oneStubArg == null) continue;
            stubsArgumentDto.add(oneStubArg.toInfoDto());
        }
        return stubsArgumentDto;
    }

    public StubArgumentDto toDto() {
        return new StubArgumentDto(
                this.dataType,
                this.name
        );
    }

    public static List<StubArgumentDto> batchToDto(List<StubArgument> stubsArgument) {
        if (AniGeneralUtils.isCollectionEmpty(stubsArgument)) return new ArrayList<>(0);
        List<StubArgumentDto> stubsArgumentDto = new ArrayList<>(stubsArgument.size());
        for (StubArgument oneStubArg : stubsArgument) {
            if (oneStubArg == null) continue;
            stubsArgumentDto.add(oneStubArg.toDto());
        }
        return stubsArgumentDto;
    }

    public static StubArgument fromInfoDto(StubArgumentInfoDto oneArgInfo){
        if(oneArgInfo == null) return null;
        return new StubArgument(
                oneArgInfo.dataType,
                oneArgInfo.name);
    }

    public static List<StubArgument> batchFromInfoDto(List<StubArgumentInfoDto> argsInfo){
        if (AniGeneralUtils.isCollectionEmpty(argsInfo)) return new ArrayList<>(0);
        List<StubArgument> arguments = new ArrayList<>(argsInfo.size());
        for(StubArgumentInfoDto oneArgInfo: argsInfo){
            if(oneArgInfo == null) continue;
            arguments.add(fromInfoDto(oneArgInfo));
        }
        return arguments;
    }

//    public static List<StubArgument>[] fromPo(List<StubArgumentPo> stubArgumentsPo){
//        int expSize = stubArgumentsPo.size() / 2;
//        List<StubArgument> inArgs = new ArrayList<>(expSize);
//        List<StubArgument> outArgs = new ArrayList<>(expSize);
//        for(StubArgumentPo onePo: stubArgumentsPo){
//            StubArgument oneArg = fromPo(onePo);
//            if(onePo.target == StubArgumentTarget.INPUT_ARG){
//                inArgs.add(oneArg);
//            } else if (onePo.target == StubArgumentTarget.OUTPUT_ARG){
//                outArgs.add(oneArg);
//            }
//        }
//        return new List[]{inArgs, outArgs};
//    }
//
//    public static StubArgument fromPo(StubArgumentPo stubArgumentPo){
//        return new StubArgument(null, stubArgumentPo.name);
//    }
}
